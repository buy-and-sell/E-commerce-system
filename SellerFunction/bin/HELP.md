####Application Properties File

Remove `example` from `example.application.properties` and replace with your database url,
batabase user and database password.

####Post Body
When creating or updating an entity use snake case in JSON body. For example,

`{
    'bank_code': '1234',
    'bank_name': 'Sample Bank'
}`

This will convert `bank_code` to `bankCode` and `bank_name` to `bankName`.
If you want to remove this conversion remove, 
`spring.jackson.property-naming-strategy=SNAKE_CASE` line from `application.properties`
file.


