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
// Observer (manages chat boxes)
public class ChatObserver {

    private ChatObservable[] chatObservable = new ChatObservable[100];
    private int nextIndex;

    // Add a new chat box (Observable)
    public void addChatBox(ChatObservable obj) {
        chatObservable[nextIndex++] = obj;
    }

    // Broadcast message to all chat boxes
    public void setMessage(String msg) {
        for (int i = 0; i < nextIndex; i++) {
            chatObservable[i].sendMessage(msg);
        }
    }

    // Check if username already exists
    public boolean userNameCheck(String userName) {
        for (int i = 0; i < nextIndex; i++) {
            if (chatObservable[i].getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }
}

                return false;
            }
        }
        return true;
    }
}
