package ru.netology.javaqa.javaqamvn.stats;
public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int s : sales) {
            sum = sum + s;
        }

        return sum;
    }

    public int middleSumSales(int[] sales) {
        int sum = sumSales(sales);
        sum = sum / sales.length;

        return sum;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int underMiddleSales(int[] sales) {
        int countMonth = 0;
        int middleSales = middleSumSales(sales);

        for (int s : sales) {
            if (s > middleSales) {
                countMonth++;
            }
        }

        return countMonth;
    }

    public int overMiddleSales(int[] sales) {
        int countMonth = 0;
        int middleSales = middleSumSales(sales);

        for (int s : sales) {
            if (s > middleSales) {
                countMonth++;
            }
        }

        return countMonth;
    }

}



