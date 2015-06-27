# Monte Carlo Tree Search methods
This is a Java implementation of Monte Carlo Tree Search methods. It is self-contained, domain-independent and can thus be easily used in any state-action domain. The project was developed for the purpose of my Bachelor’s thesis.

## Dependencies
JUnit4, Java cloning library

## Usage
Create the implementation of MctsDomainAgent.
```java
public class Player implements MctsDomainAgent<State> {...}
```
Create the implementation of MctsDomainState.
```java
public class State implements MctsDomainState<Action, Player> {...}
```
Create an instance of Mcts object and invoke uctSearch() to get the most promising action.
```java
Mcts<State, Action, Player> mcts = Mcts.initialize(NUMBER_OF_ITERATIONS);
Action mostPromisingAction = mcts.uctSearch(state, explorationParameter);
```

##### Important
For algorithm to work correct it is necessary that state's method getAvailableActionsForCurrentAgent() either returns the same instances of objects or return objects that override equals() and hashCode() methods.

Before every tree expansion and simulation a deep clone of represented state is created. This can lead to performance issues and should be taken into account when implementing MctsDomainState.
You could optionally set which classes should be ignored during state cloning.
```java
mcts.dontClone(DontCloneMe0.class, DontCloneMe1.class);
```

##### Examples
Tic-Tac-Toe example can be found in the test directory and Scotland Yard board game example can be found [here](https://github.com/nejc92/scotland-yard).

## License
This project is licensed under the terms of the MIT license. See LICENSE.md.

## Authors
Nejc Ilenič