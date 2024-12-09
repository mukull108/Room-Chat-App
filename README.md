# Chat Application - Real-time Messaging App

This is a real-time chat application built using **React** for the frontend and **Spring Boot** for the backend. It allows users to join and create chat rooms and send/receive messages in real-time. The app uses **WebSockets** and **STOMP** for real-time communication and **MongoDB** for message storage.

---

## **Features**

- **Real-time Messaging**: Send and receive messages instantly in the chat room using WebSocket and STOMP.
- **Join/Create Rooms**: Users can join existing rooms or create new ones.
- **User Authentication**: Basic authentication using username for chat rooms.
- **Message History**: Messages are saved in MongoDB and can be retrieved even after reconnecting.
- **Responsive UI**: The app is fully responsive and works on both mobile and desktop devices.

---

## **Technologies Used**

- **Frontend**:
  - **React**: JavaScript library for building the user interface.
  - **React Router**: For handling routing in the application.
  - **React Context API**: For state management (user and room details).
  - **SockJS**: For WebSocket fallback to support real-time communication across different browsers.
  - **STOMP**: Protocol used for messaging communication over WebSockets.
  - **Axios**: For making API requests to the backend.
  - **React-Hot-Toast**: For showing real-time notifications to users.

- **Backend**:
  - **Spring Boot**: For creating REST APIs and handling WebSocket connections.
  - **Spring WebSocket**: For real-time messaging with STOMP over WebSockets.
  - **MongoDB**: NoSQL database for storing messages and room data.
  - **Spring Data JPA**: For persisting entities to MongoDB.

- **Development Tools**:
  - **Docker**: For containerizing the application and making it easily deployable.
  - **AWS**: For deploying the application to the cloud.
  - **Git**: For version control.

---

## **Installation**

### **Prerequisites**

1. **Java 11 or later**
2. **Maven** (For building the Spring Boot backend)
3. **Node.js** and **npm** (For running the React frontend)

### **Clone the repository**

```bash
git clone https://github.com/yourusername/chat-app.git
cd chat-app
