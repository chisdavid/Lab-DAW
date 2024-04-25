const serverURL: string = "http://localhost:8080";

export namespace PersonRoutes {
    export const GET_ALL: string = `${serverURL}/GetAll`;
    export const LOGIN: string = `${serverURL}/Login`
}

export namespace CarRoutes {
    export const INSERT: string = `${serverURL}/Car/Insert`;
    export const GET_ALL: string = `${serverURL}/Car/GetAll`;
}