# 🔌 MCP Server Integration with Claude Desktop (Anthropic)

This project demonstrates how to build a custom MCP Server using **Spring Boot + Spring AI**, and integrate it with **Claude Desktop** (by Anthropic) to fetch system details like Java version.

---

## 📦 Prerequisites

- Java 21+
- Maven
- Claude Desktop (download from [Anthropic](https://www.anthropic.com))
- Spring Boot (compatible version)

---

## 🧰 Getting Started

### 1. 🛠️ Build the MCP Server

Clone this repo and run the following command to package the Spring Boot MCP server:

```bash
mvn clean package🔌 MCP Server Integration with Claude Desktop (Anthropic)

This project demonstrates how to build a custom MCP Server using Spring Boot + Spring AI, and integrate it with Claude Desktop (by Anthropic) to fetch system details like Java version.

📦 Prerequisites

Java 17+

Maven

Claude Desktop (download from Anthropic)

Spring Boot (compatible version)

🧰 Getting Started

1. 🛠️ Build the MCP Server

Clone this repo and run the following command to package the Spring Boot MCP server:

mvn clean package

This will generate the executable JAR in the target folder.

2. 🧪 Test Locally (Optional)

To test your MCP server locally:

java -jar target/spring-mcp-0.0.1-SNAPSHOT.jar

You should see the server running and waiting for incoming MCP requests.

🧹 Integrate with Claude Desktop

Follow the steps below to integrate your MCP server with Claude Desktop:

Step 1: Launch Claude Desktop

Start Claude Desktop after installation.

Step 2: Configure claude_desktop_config.json

Go to:

Settings → Developer → Edit Config

Update your claude_desktop_config.json with the following block:

{
  "mcpServers": {
    "jagnya-spring-mcp": {
      "command": "/Users/jagnyapanigrahi/Library/Java/JavaVirtualMachines/sapmachine-21.0.6/Contents/Home/bin/java",
      "args": [
        "-jar",
        "/Users/jagnyapanigrahi/Documents/SpringBoot/MCP/MCP/MCP-Spring-AI/spring-mcp/target/spring-mcp-0.0.1-SNAPSHOT.jar"
      ]
    }
  }
}

Step 3: Restart Claude

Once the configuration is saved, restart Claude Desktop.

You should now see:

🛠️ A hammer icon (MCP Developer Tools)

🔌 A plugin icon (for custom integrations)

💬 Try It Out

Click the 🛠️ hammer icon

Enter a prompt like:

Hi, get my system details with which Java version installed.

A popup will appear—click Allow to grant access for the current chat.

Claude will now invoke your MCP server and return the system info.

📁 Project Structure

spring-mcp/
├── src/
│   └── main/java/com/example/mcp/
│       └── controller/      # MCP tool endpoints
│       └── model/           # System info model
├── pom.xml
├── application.properties

🧠 Powered By

Spring Boot

Spring AI

Claude AI (Anthropic)

📜 License

This project is licensed under the MIT License.



