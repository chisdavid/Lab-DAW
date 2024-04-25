import { Button } from "@mui/material"
import { useNavigate } from "react-router-dom"
import { Pages } from "../Components/Router/router";

export const Home = (): JSX.Element => {
    const navigate = useNavigate();

    const onClick = (event: any): void => {
        navigate(Pages.Login)
    }

    return <div>
        <Button variant="contained" onClick={onClick} >Go to Login</Button>
    </div>
}