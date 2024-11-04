# NoteInvalideException Class

The `NoteInvalideException` class is a custom exception triggered when an invalid grade is provided. It extends the `Exception` class and is used to handle cases where a grade outside the allowed range (typically between 0 and 20) is entered.

### Attributes
No specific attributes are defined in this class, but it includes a custom message to indicate the invalid grade that caused the exception.

### Constructors
- `NoteInvalideException(int valeur)`: Creates an instance of `NoteInvalideException` with a message indicating the grade involved.
    - **Parameter**:
        - `valeur` (int): The invalid grade that triggered the exception.

### Methods
This class inherits methods from the `Exception` class. The exception message is customized to include the invalid grade.

### Usage Example
This exception can be used in contexts where grades must be validated before being accepted, such as when entering student grades. If an invalid grade is provided, the exception is triggered with an appropriate message.

---

# Evaluateur Class


The `Evaluateur` class is designed to validate student grades. It uses the `verifierNote` method to ensure that the provided grades fall within a valid range (typically between 0 and 100). If an invalid grade is entered, a `NoteInvalideException` is thrown.

### Methods
- `Evaluateur()`: Default constructor for the `Evaluateur` class.
- `void verifierNote(int note) throws NoteInvalideException`: Checks if the given grade is valid. If the grade is less than 0 or greater than 100, it throws a `NoteInvalideException`.
    - **Parameter**:
        - `note` (int): The grade to validate.
    - **Exception**:
        - `NoteInvalideException`: Thrown if the grade is outside the allowed range.

### Usage Example
The main program creates an `Evaluateur` object and tests several grades. If an invalid grade is provided, the exception is caught, and the error message is displayed in the console.

