export interface Danimals {
    title:string;
    age:number;
    height:number;
    length:number;
    _links:{
        self: {
        href: string;
        },
        danimals: {
        href: string;
        }
    }
}
