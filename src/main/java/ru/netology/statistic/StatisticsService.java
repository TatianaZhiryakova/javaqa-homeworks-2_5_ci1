package ru.netology.statistic;

public class StatisticsService {
    /**
     * Рассчитать индекс максимального дохода
     *
     * @param incomes - совокупность доходов
     * @return - индекс первого максимального значения
     */
    public long findMax(long[] incomes) {
        long currentMaxIndex = 0;
        long currentMax = incomes[0];
        for (long income : incomes)
            if (currentMax < income)
                currentMax = income;
        return currentMax;
    }
}
