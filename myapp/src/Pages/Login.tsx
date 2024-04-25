import { Button, TextField } from "@mui/material"
import axios from "axios";
import React from "react";
import { useNavigate } from "react-router-dom";
import { Pages } from "../Components/Router/router";
import { PersonRoutes } from "../backendEndpoints";
import { CustomCard } from "../Components/Card";
import { Person } from "../Models/Person";

export const Login = (): JSX.Element => {
    const [passsword, setPassword] = React.useState<string>("");
    const [email, setEmail] = React.useState<string>("");
    const [people, setPeople] = React.useState<Person[]>([])
    const navigate = useNavigate();

    const onPasswordChange = (event: any): void => {
        setPassword(event.target.value)
    }

    const onEmailChange = (event: any): void => {
        setEmail(event.target.value);
    }

    const login = (event: any): void => {
        // navigate(Pages.Home);
        // axios.get(PersonRoutes.GET_ALL).then((response: any) => {
        //     console.log(response.data)
        // })

        axios.post(PersonRoutes.LOGIN, {
            email: email,
            password: passsword
        }).then((response: any) => {
            if (response.data != '') {
                navigate(Pages.Home);
            }
        })

    }

    const renderCardList = (): JSX.Element[] => {
        return people.map((person: Person) =>
            <CustomCard title={person.name} description={"Description 1"} />
        )
    }

    return <div>
        <TextField id="outlined-basic" label="Outlined" variant="outlined" onChange={onEmailChange} />
        <TextField id="outlined-basic" label="Outlined" variant="outlined" onChange={onPasswordChange} />
        <Button variant="contained" onClick={login}>Contained</Button>



        {/* {...renderCardList()} */}
    </div>
}