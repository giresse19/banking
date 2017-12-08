# 
# Banking App. Project for Fundamentals of Programming Course.


Banking software that implements the logic 
for a bank. 

Bank has its 
customers  Every customer has its first and last name can have several 
time deposit accounts 

The banking software supports only the creation of 
time deposit accounts
. 

Time deposit accounts has its balance and maturity date
. 

Time deposit accounts allow withdraw only after a 
maturity date
. 
Time deposit accounts 
are also known as term deposit, certificate of deposit (CD), or fixed deposit 
accounts.

T
 
 **** CLASS STRUCTURE ****



____Account Class____

- This class is abstract and thus can't be instantiated
- contains an abstract method withdraw
- returns an overide string: balance

___ Bank Class____

- contains void method were customers are being added in an array
- contains getters and setters for numberofcustomers.

___CheckingAccount class ____
- extends account class
- contains one method to check account

__Customer class____
- longest class which conatains associated to customers in the bank
- sets and gets names of customers. 
- Contains method for customers to add number of accounts they have.

___ TimeDepositAccount class____
 -  contains main business logic of the app
 - gets and sets maturity date for account maturity
 - contains withdraw method which is possible only after maturity date check has been passed.
 - extends account class.
 - contains method for depositing into account.
 - contains method to get balance in account.

