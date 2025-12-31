# Java Setup Troubleshooting (Windows)

I noticed `java` isn't working in your terminal. Here is how to fix it:

## 1. Verify Installation
Check if you have a folder like `C:\Program Files\Java\jdk-21` (or similar version).
- **If no**: Please download and install it from [Oracle](https://www.oracle.com/java/technologies/downloads/).

## 2. Add to PATH
1. Press `Win + S` and search for "Environment Variables".
2. Click "Edit the system environment variables".
3. Click the **Environment Variables** button.
4. Under **System variables**, find `Path` and click **Edit**.
5. Click **New** and paste the path to your JDK `bin` folder. 
   - Example: `C:\Program Files\Java\jdk-21\bin`
6. Click OK on all windows.
7. **RESTART** your terminal/IDE for changes to take effect.

## 3. Test again
Run this in a fresh terminal:
```powershell
java -version
```

Once this works, we can start running Java code!
