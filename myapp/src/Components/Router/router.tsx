import { createBrowserRouter } from "react-router-dom";
import { Login } from "../../Pages/Login";
import { Home } from "../../Pages/Home";

export enum Pages {
    Home = "/Home",
    Login = "/Login",
}

const routes = [
    {
        path: Pages.Home,
        element: <Home />
    },
    {
        path: Pages.Login,
        element: <Login />
    },
    {
        path: "/",
        element: <div></div>
    }
]

export const router = createBrowserRouter(routes);