import { Component } from "@angular/core";
import { ItemEntity } from "./item.entity";

@Component({
    selector:'shop',
    templateUrl:'./shop.html'
})
export class ShopComponent{

    public items:Array<ItemEntity>;
    constructor(){

        var item_one:ItemEntity = new ItemEntity(101,"P. incarnata",25.40);
        var item_two:ItemEntity = new ItemEntity(202,"200V Battery", 10.11);
        var item_three:ItemEntity = new ItemEntity(303,"W. frutescens", 26.11);
        var item_four:ItemEntity = new ItemEntity(404,"Elden RIng", 59.99);
        var item_five:ItemEntity = new ItemEntity(505,"GoPro 360", 599.99);

        this.items = [item_one, item_two, item_three, item_four, item_five];
    }
}