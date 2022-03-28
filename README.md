"# Central-Blockchain-Structure" 
This program was made by Ameer Abunada as a central blockchain structure using java with a mining functionality
When starting the program it searches for blockchain.txt file to take the stored blocks from the txt file into the program, if there is not blockchain.txt file it created empty one to store the new mined blocks.
the blockchain.txt file structre: each block contains two lines in the txt file, First line containing the Header data for the block that is the second line.
after reading the data, the program checks all of the blocks if it is a valid blockchain or not by rehashing the block and compairing it to the stored hash and by compairing the stored previous hash and the actual previous hash.
the mining functionality depends on the difficulty, i staticly put the difficulty 5 (the hash must start with five "0"s) so the mining process doesn't take very long (The higher the difficulty the longer it takes to mine).
After the program mines the unconfirmed transactions it saves the new blocks into the blockchain.txt file to be reloaded when the program re runs
I hope you like my code :)
Kind Regards.
Ameer A.
