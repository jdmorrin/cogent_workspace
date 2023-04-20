import { Component, Input } from "@angular/core";
import { ItemEntity } from "./item.entity";

@Component({
    selector:'item-component',
    templateUrl:'./item.html'
})
export class ItemComponent{
    @Input()
    item!: ItemEntity;
    // item: ItemEntity = new ItemEntity(999, "Whoops", 999.999);
    constructor(){
        console.log("Shop");
    }
}