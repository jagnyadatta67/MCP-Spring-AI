MCP Server Integration with Claude Desktop Step-by-Step
Download Claude Desktop 
Start Claude Desktop 
 Claude is configured to use the MCP protocol for communication with AI model servers.
Go to Claude Setting 

Select Developer


Click on Edit Confing


 Edit claude_desktop_config.json

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
Then  Restart the Claude Desktop , if every thing is k then we can see hammer and plugin icon .

Click on hammer icon then we can see the MCP Tools 
As I have created MCP server to get the system details . Type 
Hi get my system details with which java version installed

             Its will poup up one dialoue bos , click on allow for this chat 







Then Result is will

