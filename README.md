# Routes specifications 
## POST - (/request)
### Description: counts the number of occurrences of each character type in a string
### Request Body - structure
`{
    String string,
    String expression
}`
### Response Body 
`{
    private Long uppercaseLetters = 0L; 
    private Long lowercaseLetters = 0L; 
    private Long digits = 0L;
    private Long specialSigns = 0L;
    private Long numOfOccurrences = 0L;
    }`
### Sample Request
`{
    "uppercaseLetters": 1,
    "lowercaseLetters": 5,
    "digits": 3,
    "specialSigns": 2,
    "numOfOccurrences": 3
}`
