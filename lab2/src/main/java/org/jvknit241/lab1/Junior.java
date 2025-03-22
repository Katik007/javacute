package org.jvknit241.lab1;

class Junior extends Approver {
    @Override
    protected boolean canApprove(int diff) {
        return diff < 50;
    }

    @Override
    protected void approve(Problem problem) {
        System.out.println("Младший менеджер решил задачу: " + problem.getDescription() + "; diff - " + problem.getDiff());
    }
}
