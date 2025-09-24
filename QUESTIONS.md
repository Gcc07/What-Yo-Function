## Why doesn't the integer change after the method call?

# The integer doesn't change because you aren't changing the int number within the main scope. You are only changing the int within the tryToModify scope. What you print is the modified variable within the method, not the original "number" argument that was passed into the tryToModify parameter.

## Why does the array change after the method call?

# The array passed into the parameter of the processArray method is actually referencing the original "arr" array within the main function in memory. Because of this, the changes made to the array reference in the method actually apply to the original as well.

## What happens when you try to access y outside the loop?
# You can't access y outside the loop because the y is within a seperate block scope, (The loop), meaning that it is impossible to reference the variable.