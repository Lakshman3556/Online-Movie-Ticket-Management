# Movie Ticket Booking Application

Welcome to the Movie Ticket Booking Application! This project allows users to book tickets for movies, manage their bookings, and view available movies.

## Features

- **User Registration and Authentication**: Users can register and log in to manage their bookings.
- **Movie Listings**: View a list of available movies with details such as title, duration, and genre.
- **Booking Management**: Create, retrieve, and cancel bookings for movies.
- **Responsive Design**: The application is designed to be user-friendly and responsive.

## Project Structure

```
movie-ticket-booking
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── moviebooking
│   │   │           ├── controllers
│   │   │           │   └── BookingController.java
│   │   │           ├── models
│   │   │           │   ├── Movie.java
│   │   │           │   ├── Booking.java
│   │   │           │   └── User.java
│   │   │           ├── services
│   │   │           │   └── BookingService.java
│   │   │           └── repositories
│   │   │               └── BookingRepository.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   └── test
│       └── java
├── pom.xml
└── README.md
```

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/RahulArra/Online-movie-ticket-booking.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd Online-movie-ticket-booking
   ```

3. **Build the project**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

## Technologies Used

- Java
- Spring Boot
- Maven
- Thymeleaf (for templates)
- JPA (for database interactions)

## Contributing

Contributions are welcome! Please feel free to submit a pull request or open an issue for any suggestions or improvements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.