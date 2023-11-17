Choosing between SQL and NoSQL databases depends on the specific requirements of your application. Here are some factors to consider:

1. **Data Structure**: If your data is structured and static, SQL is a good choice. If your data is unstructured or semi-structured, or if it may change over time, NoSQL may be a better choice.

2. **Scalability**: If you need to scale horizontally (i.e., add more servers) to handle large amounts of data or high traffic loads, NoSQL databases are typically a better fit. They are designed to be easily distributed across multiple servers, which can make them more scalable and resilient.

3. **Transactions**: If your application requires complex transactions with multiple operations, SQL databases are usually a better fit. They support ACID (Atomicity, Consistency, Isolation, Durability) properties that guarantee that all transactions are reliably processed.

4. **Speed**: If you need to perform many read and write operations, NoSQL databases can be faster because they allow for data denormalization, which means you can retrieve all related data in a single query.

For a cooking app where users can share recipes, ingredients, and pictures, and follow each other, a NoSQL database like MongoDB could be a good choice. This is because the data is semi-structured and may change over time (users might want to add new fields to their recipes, for example). MongoDB also supports storing large files (like pictures) using GridFS, and it can scale to handle large amounts of data and high traffic loads.

However, an SQL database could also work well for this application, especially if you want to use complex queries or transactions, or if you prefer a more structured data model.

In the end, the choice between SQL and NoSQL depends on the specific needs of your application. It's also possible to use both: a SQL database for some parts of the application and a NoSQL database for others. This is known as a polyglot persistence architecture.
