export interface Person {
    id: number,
    name: string,
    age: number,
    cars: Car[]
}

export interface Car {
    id: number,
    model: string,
    year: number,
    color: string;
}