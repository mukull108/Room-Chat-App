# Real-Time Chat Application

This is a real-time chat application built using **React** for the frontend and **Spring Boot** for the backend. The app allows users to join or create chat rooms, send and receive messages, and view real-time updates.

## Features

- **Room Creation & Joining**: Users can create a new chat room or join an existing one using a unique room ID.
- **Real-Time Messaging**: Utilizes WebSockets (with SockJS and STOMP) to provide real-time communication between users in a room.
- **Message Persistence**: Messages are stored in a MongoDB database, ensuring they persist even after the server is restarted.
- **Responsive UI**: Built with React, providing a smooth and interactive user experience.

## Technologies Used

### Frontend:
- **React**: For building the user interface.
- **Vite**: A build tool for faster development.
- **Socket.IO & STOMP**: For real-time communication between the client and server.
- **Axios**: For making API requests to the backend.
- **Toast Notifications**: For providing user feedback.

### Backend:
- **Spring Boot**: For creating the REST API and WebSocket server.
- **WebSockets (SockJS + STOMP)**: For handling real-time messaging between the client and server.
- **MongoDB**: For storing messages and room data.
- **Spring Data JPA**: For interacting with the MongoDB database.
- **No Spring Security**: No authentication or authorization is used in this project.

- ## Real-Time Messaging

This application uses **WebSockets**, specifically **SockJS** and **STOMP**, to enable real-time messaging between users in chat rooms.

- **SockJS** is a JavaScript library that provides WebSocket-like communication, even when WebSocket is not available. It ensures that the client can connect to the server in case WebSocket is not supported by the browser.
- **STOMP** (Simple Text Oriente

## Setup

### Prerequisites
- **Node.js** and **npm** (for the frontend)
- **Java** and **Maven** (for the backend)
- **MongoDB** (local or cloud instance)

### Frontend Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/chat-app.git
    cd chat-app
    ```
2. Install dependencies:
    ```bash
    npm install
    ```
3. Start the development server:
    ```bash
    npm run dev
    ```

### Backend Setup
1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/chat-app.git
    cd chat-app
    ```
2. Configure your `application.properties` file to connect to MongoDB:
    ```properties
    spring.data.mongodb.uri=mongodb://localhost:27017/chatdb
    ```
3. Build the backend using Maven:
    ```bash
    mvn clean install
    ```
4. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

### Testing the Application
1. Open the frontend application at `http://localhost:5173`.
2. Create a room or join an existing one by entering a room ID and your username.
3. Start sending messages in real-time.

## API Endpoints

- **POST** `/api/v1/rooms`: Create a new room.
- **GET** `/api/v1/rooms/{roomId}`: Join an existing room.
- **GET** `/api/v1/rooms/{roomId}/messages`: Get messages of a room with pagination.
- **WebSocket Endpoint**: `/chat`: For real-time message exchange using STOMP.

d Messaging Protocol) is used as the messaging protocol over WebSockets. It simplifies the process of sending and receiving messages in a structured format.
