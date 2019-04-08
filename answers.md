# Activity 7

## Questions

1. A deck of cards, a board with 9 cards, and a "discard" pile of cards that have already been through the board

2. 	Begin by creating a new ElevensBoard. 
	Select two or three cards and check if they are a legal play. If they are, remove them and deal three new cards. 
	After a play, check and see if there are more plays possible. If not, start a new game. If there are, keep playing. 
	Make sure to keep checking the deck, because once the deck is empty the game is won.

3. No, there is no way to select multiple cards

4. a. When starting a game, either upon creation of the board or at a new game.
b. isLegal and anotherPlayIsPossible
c. 0 : 0, 1: 1, 2 : 3, 3 : 6, 4: 7
d. for (int i = 0; i < cIndexes.size(); i++) {
	System.out.println(cards[cIndexes[i]].toString());
}
e. anotherPlayIsPossible, because it needs to look at all of the cards on the board to see if there is another play which can be made