import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

# 1. 生成日期范围
dates = pd.date_range(start="2024-01-01", periods=100)

# 2. 用 numpy 模拟股票价格（随机游走）
np.random.seed(42)
price_changes = np.random.normal(loc=0, scale=1, size=100)  # 平均为0，标准差为1
prices = 100 + np.cumsum(price_changes)  # 从100起步的累计和

# 3. 创建 pandas DataFrame
df = pd.DataFrame({
    'Date': dates,
    'Price': prices
})
df.set_index('Date', inplace=True)

# 4. 计算简单移动平均（SMA）
df['SMA_10'] = df['Price'].rolling(window=10).mean()

# 5. 用 matplotlib 画出股价与平均值
plt.figure(figsize=(12, 6))
plt.plot(df.index, df['Price'], label='Stock Price')
plt.plot(df.index, df['SMA_10'], label='10-Day SMA', linestyle='--')
plt.title('Simulated Stock Price with 10-Day Moving Average')
plt.xlabel('Date')
plt.ylabel('Price')
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()