# README

## Author: Steve Sharpe

## Project: Episode Management Application

### Overview
This project is part of the `com.steve` package and demonstrates an episode management application. It uses the `Episodes` class to represent and manipulate episode details such as the episode date, guest name, season number, episode number, and whether live music is featured.

The `Main` class is the entry point of the application and allows users to:
1. Set episode details (date, guest name, season, etc.).
2. Print the episode information to the console.

### Features

- **Episode Date Management**:  
  The `Episodes` class allows setting and retrieving the episode's date (year, month, day).

- **Episode Properties**:  
  The class handles the following properties of an episode:
  - Guest name
  - Season number
  - Episode number
  - Live music indicator

- **Console Output**:  
  The application prints episode details such as the date, guest name, season number, episode number, and live music status.

### Running the Application

#### Prerequisites:
- **Java Development Kit (JDK)**: Ensure Java 8 or higher is installed.

#### Steps to Run:
1. **Clone the repository** (or download the project files).
2. **Compile and Run** the `Main` class:
   ```bash
   javac com/steve/Main.java
   java com.steve.Main
   ```
   
3. The console will display details of an episode, including the year, month, day, guest name, season number, episode number, and live music status.

### Example Output

```
Episode Year: 24
Episode Month: 10
Episode Day: 31
Guest Name: John Doe
Season Number: 1
Episode Number: 1
Live Music: true
Episode{year=24, month=10, day=31, guestName='John Doe', seasonNumber=1, episodeNumber=1, liveMusic=true}
```

### Classes

- **Main**:  
  The entry point of the application where episode details are set and printed.

- **Episodes**:  
  A class (not shown here) that stores and manages episode information like date, guest name, season number, episode number, and live music status. It also provides a `toString` method to output episode details.

### Future Enhancements

- Add user input via `Scanner` to allow dynamic setting of episode details.
- Add validation to ensure episode date values are valid.
- Extend functionality for handling multiple episodes in a series. 

### Contact
For any queries or issues, feel free to reach out to the project maintainer.
