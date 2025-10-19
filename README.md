# Number Guessing Game

A simple **Command-Line Interface (CLI) number guessing game** in Java, where the computer randomly selects a number and the user has to guess it within a limited number of attempts.

This project is based on the [Number Guessing Game challenge from roadmap.sh](https://roadmap.sh/projects/number-guessing-game)

---

## Table of Contents

- [Number Guessing Game](#number-guessing-game)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Requirements](#requirements)
  - [Installation](#installation)
  - [How to Play](#how-to-play)
  - [Future Improvements](#future-improvements)

---

## Features

- CLI-based game.
- Randomly selects a number between 1 and 100.
- Difficulty levels: Easy, Medium, Hard.
- Provides feedback if the guess is higher or lower than the target number.
- Tracks number of attempts.
- Ends the game when the user guesses correctly or runs out of chances.

---

## Requirements

- Java JDK 8 or higher.
- Terminal/Command Prompt to run the game.

---

## Installation

1. Clone this repository:

```bash
git clone https://github.com/YOUR_USERNAME/number-guessing-game.git
```

2. Navigate to the project folder:
```bash
cd number-guessing-game
```

3. Compile the Java program:
```bash
javac Game.java
```

4. Run the game:
```bash
java Game
```

---

## How to Play

1. Launch the game in your terminal.
2. Read the welcome message and rules.
3. Select a difficulty level:
- Easy: 10 attempts
- Medium: 5 attempts
- Hard: 3 attempts
4. Enter your guesses.
5. The game will indicate if the target number is higher or lower.
6. Win by guessing correctly within the allowed attempts, or lose if you run out of chances.

---

## Future Improvements

- Allow multiple rounds of play.
- Add a timer to track how long it takes to guess the number.
- Implement a hint system for stuck users.
- Track high scores for each difficulty level.

---

License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
