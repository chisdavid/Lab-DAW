import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Button, ButtonGroup } from '@mui/material';
import { CustomCard } from './Components/Card';
import axios from 'axios';


export const App = ():JSX.Element=>{
  const [text, setText] = React.useState<string>("");

  const onChange = (event:any):void =>{
    setText(event.target.value);
  };

  const onClick = (event: any):void=>{
    console.log(text);
  }

  const callServer = ():void=>{
    axios.get("http://localhost:8080/jhjdbfkGetName").then((response:any) =>{
        console.log(response)
    })

    axios.post("askjfaskf",

    {
      ana:"naa"
    }
    )
  }

  return <div>
    <button onClick={onClick}> Type</button>
    <input type='text' onChange={onChange}></input>

    <ButtonGroup variant="contained" aria-label="Basic button group">
      <Button>One</Button>
      <Button onClick={callServer}>Two</Button>
      <Button>Three</Button>
    </ButtonGroup>
      <CustomCard description='Ana are mere' title='Title'/>
      
  </div>
}

