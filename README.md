# Compiler Design Project

## Table of Contents

- [Introduction](#introduction)
- [Project Overview](#project-overview)
- [Usage](#usage)
- [Features](#features)
- [Contributions](#contributions)
- [License](#license)

## Introduction

Welcome to the Compiler Design project for the "compiler-design" class. This project is aimed at developing a compiler for a front-end language that bears similarities to JSX or Angular statements (e.g., ngIf, ngFor). The compiler encompasses all critical stages, including Lexical Analysis, Syntax Analysis, Semantic Analysis, and Code Generation, making it a comprehensive and educational endeavor in the field of compiler design.

We have leveraged the power of Antlr, a versatile parser generator, and the Visitor design pattern in Java to streamline and facilitate the implementation process.

## Project Overview

This repository houses the complete source code for the Compiler Design project. The project is structured to handle the following key stages of a compiler:

1. **Lexical Analysis**: Tokenizes the input source code into meaningful tokens.
2. **Syntax Analysis**: Parses the token stream into an abstract syntax tree (AST) while enforcing language grammar rules.
3. **Semantic Analysis**: Validates the semantic correctness of the code, such as type checking, scoping, and other language-specific rules.
4. **Code Generation**: Transforms the validated AST into target code, ready for execution or further processing.

The project is designed to compile a custom front-end language that incorporates JSX-like syntax and Angular-inspired statements. It serves as a robust example of how to build a complete compiler from scratch.

# Usage

To use the compiler, follow these steps:

1. **Clone the Repository**: 

    ```bash
    git clone https://github.com/yourusername/compiler-design-project.git
    ```

2. **Prerequisites**:

   - Java Development Kit (JDK)
   - Antlr (make sure it's installed and properly configured)

3. **Compile the Project**:

   You can build the project using your preferred Java IDE (e.g., IntelliJ, Eclipse) or by using a build tool like Apache Maven.

4. **Compile Source Code**:

   If you're using a Java IDE, you can compile the project directly from the IDE.

   If you prefer to compile from the command line, navigate to the root of the project and compile the source code with:

    ```bash
    javac -cp .:path/to/antlr-4.9.2-complete.jar Main.java
    ```

   Ensure to replace `path/to/antlr-4.9.2-complete.jar` with the actual path to your Antlr library.

5. **Run the Compiler**:

   Execute the compiler by running the `Main` class with your source file as an argument:

    ```bash
    java -cp .:path/to/antlr-4.9.2-complete.jar Main your_source_file.your_extension
    ```

   Replace `your_source_file.your_extension` with the actual source file you want to compile.

This will process your source file through the lexer, parser, and other compiler stages, and display the resulting AST (Abstract Syntax Tree) and symbol table information.

Feel free to explore and modify the `Main` class to suit your specific requirements. If you encounter any issues or have questions, please don't hesitate to reach out for assistance.

## Features

- Comprehensive compiler for a custom front-end language
- Implementation of Lexical Analysis, Syntax Analysis, Semantic Analysis, and Code Generation
- Utilizes Antlr for parsing
- Implements the Visitor design pattern for efficient traversal
- Demonstrates how to handle JSX-like syntax and Angular-inspired statements
- Ideal for educational purposes and as a foundation for more complex compilers

## Contributions

This project is not open for contributions, it's primarily intended for archiving and personal reference.

## License

This project is licensed under the MIT License.

Enjoy your exploration of compiler design with this project, and feel free to reach out with any questions or feedback. Happy coding!
