
## REST API for Basic Banking System

- Deposit Amount to given account
- Withdraw Amount from given account
- Check Balance of given account
- Money Transfer from one account to another account
- Total deposit amount for given account on given date
- Total transferred amount for given account between given dates
- Show all the bank accounts, having balance above 10000
- Show transactions amount type wise, for given account number 
  - Withdraw : 10000
  - Deposit : 100000
  - Transfer : 8000

### Entity Required
- BankAccount 
  - id : long
  - acNm : string, non null
  - acNum : string, non null unique
  - balance : double, non null
  - lastTxn : date, non null
  - txnType : int (1=withdraw,2=deposit,3=transfer)