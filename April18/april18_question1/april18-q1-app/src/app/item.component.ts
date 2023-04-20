import { Component, Input } from "@angular/core";

@Component({
    selector:'itemsel',
    templateUrl:'./item.component.html'
})
export class Item{
    // @Input()
    // itemNo:number;
    // @Input()
    // itemName:string;
    // @Input()
    // itemPrice:number;

    // ngOnInit(){
    //     console.log("Item No: " +this.itemNo+"\n");
    //     console.log("Item Name: " +this.itemName+"\n");
    //     console.log("Item Proce: " +this.itemPrice+"\n");
    // }

    // itemNo=[111,222,333,444,555];
    // itemName=["Intel Cor i7", "Nord N200", "ASUS Laptop", "Passion Vine", "Fountain Pen"];
    // itemPrice=[89.99, 150.00, 300.99, 25.25, 13.99]

    isForm:boolean = false;

    itemList = [
        {
            num:1,
            name:"Nord N200",
            price:150.99,
            image:"https://tse2.mm.bing.net/th?id=OIP.I5q22pk-RIeF1zNkvjNxUwHaHa&pid=Api"
        },
        {
            num:2,
            name:"ASUS Laptop",
            price:215.45,
            image:"https://tse1.mm.bing.net/th?id=OIP.gN7NSxZAScDdqTU06tvH3AHaHa&pid=Api"
        },
        {
            num:3,
            name:"Passiflora incarnata",
            price:23.50,
            image:"https://tse4.mm.bing.net/th?id=OIP.Ixes-4LADu3jCUyK9N6RTQHaJA&pid=Api"
        },
        {
            num:4,
            name:"Fountain Pen",
            price:13.99,
            image:"https://tse2.mm.bing.net/th?id=OIP.H82m45MjM48cq5KIQ0V39AHaGp&pid=Api"
        },
        {
            num:5,
            name:"GoPro 360",
            price:699.99,
            image:"https://tse3.mm.bing.net/th?id=OIP.aYYY0hqvT9_oLU9UVulqQgHaIk&pid=Api"
        }
    ]

    delete(index:number){
        this.itemList.splice(index,1);
    }

    toggle(){
        this.isForm = ! this.isForm;
    }

    displayForm(){
        const editingForm: HTMLElement = document.getElementById('editingForm')!;
        editingForm.style.display = "block";
    }

    update(index:number, newId:number, newName:string, newPrice:number){
        this.itemList[index].num = newId;
        this.itemList[index].name = newName;
        this.itemList[index].price = newPrice;
    }

}