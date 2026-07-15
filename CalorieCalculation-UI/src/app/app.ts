import {Component} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {Person} from '../model/person';
import {NgClass} from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.html',
  imports: [
    FormsModule,
    NgClass,
  ],
  styleUrls: ['./app.css']
})
export class App {
  user: Person = new Person();
  result: number | null = null;
  calculated = false;


  selectGender(gander: string) {
    this.user.gender = gander;
  }

  get isFormValid(): boolean {
    return !!this.user.name
      && !!this.user.weightKg && this.user.weightKg <= 150
      && !!this.user.heightCm && this.user.heightCm <= 3.00
      && !!this.user.age && this.user.age <= 80
      && !!this.user.gender
      && !!this.user.activityLevel;
  }


  calculateCalories() {
    let bmr: number;
    if (this.user.gender === 'male') {
      bmr = 88.362 + (13.397 * this.user.weightKg) + (4.799 * this.user.heightCm) - (5.677 * this.user.age);
    } else {
      bmr = 447.593 + (9.247 * this.user.weightKg) + (3.098 * this.user.heightCm) - (4.330 * this.user.age) - 161;
    }
    this.result = Math.round(bmr * Number(this.user.activityLevel));
    this.calculated = true;
  }


}
