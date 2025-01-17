# User Guide

## Table of contents

- [Introduction](#introduction)
- [Quick Start](#quick-start)
- [Features](#features)
- [Usage](#usage)
- [FAQ](#faq)
- [Command Summary](#command-summary)

## Introduction

Stocker is a desktop app that will provide quick access to currently available stock,
track incoming stock and expiration dates, and categorize drugs based on different labels.
It is optimized for use via a Command Line Interface (CLI). If you can type fast, Stocker
can get your inventory management tasks done faster than traditional GUI apps.

## Quick Start

{Give steps to get started quickly}

1. Ensure that you have Java 11 or above installed.
2. Down the latest version of `Stocker` from [here](https://github.com/AY2324S1-CS2113-T17-3/tp/releases).
3. Copy the absolute filepath to where the jar file is
4. Run the following JAR file with the following command

```
java -jar "<File path of jar file>"
```

## Features

### Feature-Login System

Authentication system that allows user to register as a user or login
as an existing user.

### Feature-add

Adds a drug into the inventory list.

### Feature-delete

Deletes a drug being tracked by the system.

### Feature-list

List all drug information that is being tracked by the system.

### Feature-find

Finds drugs using their name or expiry date.

### Feature-help

List all currently available commands in current version, their
uses and how to format them in the command line.

### Feature-register

Register a new user into the login system.

### Feature-login

Login an existing user into the system.

### Feature-save

Save existing drugs from inventory list onto a txt file.
File is then used to update inventory list when stocker is ran.

### Feature-add vendor

Adds a vendor into a list to be tracked by the system.

### Feature-list vendors

Displays the name of all vendors being tracked by the system.

### Feature-add vendor supply

Adds a drug into a vendor's supply list to be tracked by the system.

### Feature-list vendor supply

Displays the list of all drugs being supplied by a particular vendor.

### Feature-find vendor supply

Displays the list of all vendors that supply a particular drug.

### Feature-add to cart

Adds a drug to the current cart if the requested quantity is available in the inventory.

### Feature-view cart

List all added drugs in the current cart.

### Feature-checkout

Empty the current cart and retrieve the specified items and quantity from the inventory.

### Feature-add description

Adds a drug's description into a list to be tracked by the system.

### Feature-get description

Retrieves the description of a particular drug.

### Feature-list description

Displays a list of all the descriptions for all corresponding drugs

## Usage

### `Login System`- Create new user or login existing user

Login system is automatically launched at the start of the programme.

**Registering a user**

> Step 1 : Enter register to select option to register a user.
>
> `register`
>
> Step 2: Enter desired username and password.
>
> Upon successful creation, registration success message is observed

Expected outcome:

```
Registration successful.
```

**Login an existing user**

> Step 1 : Enter login to select option to login a user.
>
> `login`
>
> Step 2: Enter registered username and password.
>
> Upon successful creation, successful login message is observed.

Expected outcome:

```
Login Successful.
```

Note

### `add` - Adds drug into inventory list

Adds a drug to be tracked by the system.

Format:

add /n DRUG_NAME /d EXPIRY_DATE /s SERIAL_NUMBER /q QUANTITY /p PRICE

Example of usage:

`add /n Panadol /d 01/02/2024 /s ABC123 /q 52 /p 19.90
`

Expected outcome:

```
|| New drug added in the inventory: Panadol
```

### `delete` - Deletes a drug being tracked by the system

Deletes a drug being tracked by the system.

Format:

delete /s SERIAL_NUMBER

Example of usage:

`delete /s PANA002
`

Expected outcome:

```
|| removed : Panadol
|| There are now 0 drugs in the system
```

### `list` - List all drug information that is being tracked by the system

List all drug information that is being tracked by the system.

Format:

list

Example of usage:

`list
`

Expected outcome:

```
||  1. Name: Panadol, Expiry Date: 01/02/2024  Quantity: 300
||
|| Listed all drugs in the inventory.
```

### `stocklevel` - List all drugs by quantity level in ascending order

List all drugs by quantity level in ascending order.

Format:

stocklevel

Example of usage:

`stocklevel
`

Expected outcome:

```
||  1. Name: histamine, Expiry date: 01/02/2024, Quantity: 10
||  2. Name: paracetamol, Expiry date: 01/02/2024, Quantity: 50
||  3. Name: panadol, Expiry date: 01/02/2024, Quantity: 120
||
|| Stock Level Report (Sorted by Quantity)
```

### `find` - Finds drugs using their name or expiry date

1. Finds drugs whose **names** contain any of the given keywords.

Format:

find /n panadol

Example of usage:

`find /n KEYWORD `

- The search is case-insensitive, meaning that "aspirin" will match "Aspirin."

- The order of the keywords does not matter. For example, "Painkiller Relief" will match "Relief Painkiller."

- Only the drug name is searched.

Expected outcome:

```
||  1. Name: panadol, Expiry Date: 01/02/2024, Serial number: PAN1234, Quantity: 120

|| Listed all drugs with the keyword in the inventory.
```

2. Finds drugs whose **expiry dates** contain any of the given keywords.

Format:

find /d sep

Example of usage:

`find /d KEYWORD`

- Only the drug's expiry date is searched.

Expected outcome:

```
||  1. Name: panadol, Expiry Date: 01/02/2024, Serial number: PAN1234, Quantity: 120

|| Listed all drugs with the keyword in the inventory.
```

3Finds drugs whose **serial number** contain any of the given keywords.

Format:

find /s PAN1234

Example of usage:

`find /s KEYWORD`

- Only the drug's serial number is searched.

Expected outcome:

```
||  1. Name: panadol, Expiry Date: 01/02/2024, Serial number: PAN1234, Quantity: 120

|| Listed all drugs with the keyword in the inventory.
```

### `help` - List currently available commands in current version, their uses and how to format them in the command line

List all currently available commands in current version,
their uses and how to format them in the command line

Format:

help

Example of usage:

`help
`

### `register` - Register a new user into the system

Asks for user input for a username and password field which
will be used to create a new user for the system.

Format:

register

Example of usage:

`register`

Expected outcome:

```
Registration Successful.
New User Created.
```

### `login` - login an existing user into the system

Asks for user input for a username and password field which
will be used to check if such a user exists for the system
and log the user in.

Format:

login

Example of usage:

`login`

Expected outcome:

```
Login Sucessful
Welcome Back!
```

### `save` - save existing drugs onto hard drive of computer

Saves existing drugs onto hard drive of computer. The txt file
is then used as reference to update drug inventory when stocker
is booted up.

Format:

save

Example of usage:

`save`

Expected outcome:

```
Drugs successfully saved.
```

### `addVendor` - adds a vendor into list of vendors being tracked by system

Adds a vendor to be tracked by the system. The enteries are used to form a list of summarised vendors.
is booted up.

Format:

addVendor DRUGNAME

Example of usage:

`addVendor Moderna`

Expected outcome:

```
|| New vendor added into the vendors list: Moderna
```

### `listVendors` - list all vendors currently being tracked by the system

Displays a list of all vendors currently being tracked by the system.

Format:

listVendors

Example of usage:

`listVendors`

Expected outcome:

```
||  1. Name : Moderna
||
|| Listed all vendors in the list.
```

### `addVendorSupply` - Adds a drug into a vendor's supply list to be tracked by the system.

Adds a drug into a vendor's supply list to be tracked by the system, and vendor must already be added into the system.

Format:

addVendorSupply VENDOR_NAME DRUG_NAME

Example of usage:

`addVendorSupply Moderna Paracetamol`

Expected outcome:

```
|| New drug added to moderna's supply list: paracetamol
```

### `listVendorSupply` - Displays the list of all drugs being supplied by a particular vendor.

Displays the list of all drugs being supplied by a particular vendor.

Format:

listVendorSupply VENDOR_NAME

Example of usage:

`listVendorSupply Moderna`

Expected outcome:

```
|| Drugs supplied by Moderna: paracetamol, panadol
```

### `findVendorSupply` -Displays the list of all vendors that supply a particular drug.

Displays the list of all vendors that supply a particular drug.

Format:

findVendorSupply DRUG_NAME

Example of usage:

`findVendorSupply paracetamol`

Expected outcome:

```
|| Vendors supplying the drug paracetamol: moderna, apotheca
```

### `addtocart` - Adds drug into current cart

Adds a drug in a specified quantity in the current cart.

Format:

addtocart /s SERIAL_NUMBER /q QUANTITY

Example of usage:

`addtocart /s PANA01 /q 3
`

Expected outcome:

```
|| New drug added in the cart : Panadol
```

### `viewcart` - Lists all the entries in the cart

Lists all the added drugs and quantity in the cart.

Format:

viewcart

Example of usage:

`viewcart
`

Expected outcome:

```
||  1. Key : Panadole, Quantity: 10
||
|| Listed all the content of your cart.
```

### `checkout` - Checks out the current cart

Empty the current cart and retrieve all the specified drugs and quantity from the inventory

Format:

checkout

Example of usage:

`checkout
`

Expected outcome:

```
|| The current cart has been checked out.
```

### `setthreshold` - Set the threshold quantity for a drug

Set the threshold quantity for a specific drug in your inventory. The threshold quantity is the minimum quantity of the
drug that you want to keep in stock.

Format:

setthreshold /s [Serial number] /tq [Threshold Quantity]

Example of usage:

`setthreshold /s DOL002 /tq 50
`

Expected outcome:

```
|| Threshold quantity set for Doliprane: 50
```

### `listthreshold` - List all drugs and their threshold levels

Retrieve a list of all drugs in your inventory and their corresponding threshold levels. The threshold level is the
minimum quantity of each drug that you want to keep in stock.

Format:

listthreshold

Example of usage:

`listthreshold
`

Expected outcome:

```
||  1. Doliprane: 50
||
|| Listed all drugs by threshold level in the inventory.

```

### `addDescription` - Adds a drug's description into a list to be tracked by the system.

Adds a drug's description into a list to be tracked by the system.

Format:

addDescription /n DRUG_NAME /desc DESCRIPTION

Example of usage:

`addDescription /n Panadol /desc Pain Relief
`

Expected outcome:

```
|| New drug description added for Panadol: Pain Relief
```

### `getDescription` - Retrieves the description of a particular drug.

Retrieves the description of a particular drug.

Format:

getDescription /n DRUG_NAME

Example of usage:

`getDescription /n Panadol
`

Expected outcome:

```
|| Pain Relief
```

### `listDescriptions` - Displays a list of all the descriptions for all corresponding drugs

Displays a list of all the descriptions for all corresponding drugs

Format:

listDescriptions

Example of usage:

`listDescriptions
`

Expected outcome:

```
|| List of Drug Descriptions:
|| Panadol: Pain Relief
|| Dolo: Stomache Discomfort
```

## FAQ

**Q**: Can i register with blank username and password

**A**: No. Ensure your entries are not blank.

**Q**: Why can i register and login again even after being logged in

**A**: A user is able to login another user or can help to register a new user without rebooting the application

**Q**: Why is my registration and login details not masked

**A**: Masking of input is a security concern that will be developed on in future iterations

## Command Summary

- add : `add /n DRUG_NAME /d EXPIRY_DATE /s SERIAL_NUMBER /q QUANTITY`
- delete : `delete /s SERIAL_NUMBER`
- list : `list`
- find : `find /n KEYWORD` or `find /d KEYWORD`
- help : `help`
- register : `register`
- login : `login`
- save : `save`
- add Vendor : `addVendor`
- list Vendor : `listVendors`
- add Vendor Supply : `addVendorSupply VENDOR_NAME DRUG_NAME`
- list Vendor Supply : `listVendorSupply VENDOR_NAME`
- find Vendor Supply : `findVendorSupply DRUG_NAME`
- add description : `addDescription /n DRUG_NAME /desc DESCRIPTION`
- get description : `getDescription /n DRUG_NAME`
- list descriptions : `listDescriptions`
- bye : `bye`
