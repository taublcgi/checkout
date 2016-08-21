# checkout
Capgemini Java Test<br/>
<p>
Java compiler version 1.8.0_92 used and Eclipse to build the project.
</p>
<p>
<b>1st commit</b> sets up a checkout, item interface, 2 items(orange, apple) extending the item interface and one unit test.
</p>
<p>
The checkout takes a list of items and add the prices of the list of items returning the total.
</p>
<p>
All items should have item type and price attributes.  More item types can be added later.
</p
<p>
The test passes a list of items and checks the total.
</p>
<p>
<b>2nd commit</b> enable the promotions on the checkout. The checkout object will take a list of items with their associated promotion types, this list can be empty if there are no promotions.  This enables the flexibilty of enabling and disabling promotions on some all or no items.
</p>
<p>
Switch from the big decimal type to integer to avoid loss of precision on the floating point numbers during arithmetic functions.
</p>
<p>
2 addition JUnit tests added. 
<ul><li>One to test the adding 3 oranges and 2 apples with 3 for 2 promotion on the oranges and 2 for 1 promotion on apples.  The total price should be the same as 2 oranges and 1 apple.
</li>
<li>
The other test is negative to check that negative prices for items cannot be set.  This should raise an exception.
</li>
<li>
The original test is updated to test passing an empty promotion list and this will total prices without any promotions applied.
</li>
</ul>
</p>
