# CalorieCalculation-UI

Eine knappe, benutzerfreundliche Angular-Oberfläche zur Berechnung des täglichen Kalorienbedarfs (TDEE).

Kurzbeschreibung
----------------
Dieses Projekt ist eine schlanke, reine Frontend‑Implementierung (Angular) eines TDEE-/Kalorienrechners. Alle Berechnungen laufen clientseitig im Browser — kein Backend, keine Datenbank. Die App eignet sich als Demo, Lernprojekt oder als UI, die später mit einer vorhandenen Java‑Berechnungslogik verknüpft werden kann.

Warum dieses Projekt? (Kurz)
---------------------------
- Phase 1 (Ursprung): Die Berechnungslogik habe ich ursprünglich als einzelnes Java‑Projekt implementiert — im Kern nur eine Java‑Klasse zur Berechnung von BMR/TDEE.
- Phase 2 (UI): Aus Interesse habe ich eine eigenständige Benutzeroberfläche in Angular gebaut, die dieselbe Logik im Browser ausführt. So ist eine einfache, wartbare UI ohne Server entstanden.

Link zum ursprünglichen Java-Projekt
-----------------------------------

Java-Berechnungslogik (ursprüngliches Projekt): https://github.com/Hussin-al/CalorieCalculation

Installation — Schnellstart
---------------------------
Voraussetzungen:
- Node.js (LTS empfohlen)
- npm
- Optional: Angular CLI

Repository klonen und starten:

```bash
git clone <dein-repo-url>
cd CalorieCalculation-UI
npm install
npm start
```

Standardmäßig läuft die App dann unter http://localhost:4200.

Wichtige npm-Skripte
--------------------
- `npm start` — Entwicklung (ng serve)
- `npm run build` — Produktions-Build (dist/)
- `npm test` — Tests (falls eingerichtet)

Kurze Beschreibung der Benutzung
--------------------------------
Gib Gewicht (kg), Größe (cm), Alter, Geschlecht und Aktivitätslevel ein. Die App zeigt den berechneten Grundumsatz (BMR) und den geschätzten Tagesbedarf (TDEE). Die Berechnung erfolgt sofort im Browser.

Typische Eingaben (Beispiel)
```json
{
  "weightKg": 80,
  "heightCm": 180,
  "age": 30,
  "gender": "male",
  "activityLevel": 1.55
}
```

Features
--------
- Berechnung BMR & TDEE
- Einfache, responsive UI (Bootstrap)
- Vollständig clientseitig (kein Server nötig)
- Leicht erweiterbar / integrierbar mit Backend



