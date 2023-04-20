import { Component, EventEmitter, Output } from "@angular/core";

@Component({
    selector:'deposit-component',
    templateUrl:'./deposit.html'
})
export class DepositComponet{
    @Output()
    moneyDeposited = new EventEmitter();
    depositAmt:number = 0;

    deposit(){
        
    }

}