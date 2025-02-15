package org.jvknit241;

class Senior extends Approver {
    @Override
    protected boolean canApprove(int diff) {
        return (diff<=50) && (diff < 100);
    }

    @Override
    protected void approve(Problem problem) {
        System.out.println("Старший менеджер решил задачу: " + problem.getDescription() + "; diff - " + problem.getDiff());
    }
}

