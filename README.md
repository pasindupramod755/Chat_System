# 💬 Chat System

A **Java OOP-based Chat System** that demonstrates the use of **Polymorphism** through different message handling and UI windows.  
The system allows sending messages, creating new message windows, and simulates both **public** and **private messaging**.  

---

![Java](https://img.shields.io/badge/Java-11%2B-blue?style=for-the-badge&logo=java)
![Swing](https://img.shields.io/badge/GUI-Java%20Swing-orange?style=for-the-badge)
![OOP](https://img.shields.io/badge/OOP-Polymorphism-green?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-purple?style=for-the-badge)

---

## ✨ Features
- 🖥️ **Java Swing UI** for chat interface  
- 💬 **Send messages** between users  
- 🆕 **Open new message windows** dynamically  
- 🔒 Support for **private chats**  
- 📢 **Public chat** simulation  
- 🎵 **Message notifications** (optional sound support)  
- 🔑 Core OOP concepts:
  - **Polymorphism** → Different message types handled by the same base interface/class  
  - **Inheritance** → Base `Message` class with specialized `TextMessage`, `MediaMessage`, etc.  
  - **Encapsulation** → Private fields with getters/setters for message data  
  - **Composition** → Chat window contains multiple messages & components  

---

## 🏗️ OOP Design

### 🔑 Class Design (simplified)
```java
// Base class
public abstract class Message {
    protected String sender;
    protected String content;
    public abstract void display(); // Polymorphic behavior
}

// Text Message
public class TextMessage extends Message {
    @Override
    public void display() {
        System.out.println(sender + ": " + content);
    }
}

// Media Message
public class MediaMessage extends Message {
    @Override
    public void display() {
        System.out.println(sender + " sent a media file: " + content);
    }
}
