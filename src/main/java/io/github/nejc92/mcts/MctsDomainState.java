package io.github.nejc92.mcts;

import java.util.List;

public interface MctsDomainState<ActionT, AgentT extends MctsDomainAgent> {

    boolean isTerminal();
    AgentT getCurrentAgent();
    int getNumberOfAvailableActionsForCurrentAgent();
    List<ActionT> getAvailableActionsForCurrentAgent();
    MctsDomainState performActionForCurrentAgent(ActionT action);
    AgentT getPreviousAgent();
}