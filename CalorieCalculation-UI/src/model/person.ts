export class Person {
  name: string = '';
  age: number = 0;
  weightKg: number = 0;
  heightCm: number = 0.0;
  gender: string = '';
  activityLevel: number | null = null; // user must select

  validate(): string[] {

    const errors: string[] = [];

    if (!this.name.trim()) {
      errors.push('Name fehlt');
    }

    if (this.weightKg < 20 || this.weightKg > 400) {
      errors.push('Gewicht ungültig');
    }

    if (this.heightCm < 50 || this.heightCm > 250) {
      errors.push('Größe ungültig');
    }

    if (this.age < 1 || this.age > 120) {
      errors.push('Alter ungültig');
    }

    if (!this.gender) {
      errors.push('Geschlecht nicht ausgewählt');
    }

    if (!this.activityLevel) {
      errors.push('Aktivitätslevel nicht ausgewählt');
    }

    return errors;
  }

}
