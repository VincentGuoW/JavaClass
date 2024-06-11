#Change the VS Code Interpreter: VS Code -> View -> Command Palette... (Ctrl+Shift+P) -> 
#Python: Select Interpreter -> select "Python: Select Interpreter" (or Enter) -> 
#select an interpreter based on our chosen Python version under which you have installed
# the package.

# import os //This is for check directiory
# print (os.getcwd())

#test test tstest
#import pandas as pd; 

#excel_file = ".\June2024\YokiProject\PL.xlsx"
#csv_file = ".\June2024\YokiProject\Sample.csv"

#df = pd.read_excel(excel_file)
#df_csv = pd.read_csv(csv_file)

#print(df_csv)

from datetime import datetime
import os
import pandas as pd

main_file = ".\June2024\YokiProject\Project1.xlsx"
new_file = ".\June2024\YokiProject\Project2.xlsx"


df1=pd.read_excel(main_file, engine='openpyxl')
df2=pd.read_excel(new_file, engine='openpyxl')

columns_arrays = [
    ["日期","Time","Date","TIME"],
    ["客户"],
    ["柜号"],
    ["FBA仓库简称"],
    ["派送类型"],
    ["Reference ID","ReferenceID"],
    ["FBA ID","FBAID"],
    ["箱数"],
    ["体积"],
    ["重量"],
    ["长"],
    ["宽"],
    ["高"],
    ["品名"],
    ["唛头"],
    ["备注"]
]


# 当前日期
current_date = datetime.now().date()

# 为 df2 临时添加 time 列，列值为当前日期
df2_with_time = df2.assign(Time=current_date)

# 确保df2只有df1中存在的列
df2 = df2[[col for col in df2.columns if col in df1.columns]]
# 使用pd.concat将两个DataFrame沿行方向连接
#merged_df = pd.concat([df1, df2], ignore_index=True)
merged_df = pd.concat([df1, df2_with_time], ignore_index=True)




# 确定两个数据框中共有的列
#common_columns = df1.columns.intersection(df2.columns)

# 合并数据框，基于共有的列
#merged_df = pd.merge(df1, df2, on=list(common_columns), how='outer')
#merged_df.to_excel("c:/Users/o_ovi/Desktop/Java/June2024/YokiProject/MergedFile.xlsx", index=False)
# 生成新的文件名
file_count = 1
output_file = f"c:/Users/o_ovi/Desktop/Java/June2024/YokiProject/MergedFile{file_count}.xlsx"

# 检查文件是否存在，如果存在，则增加计数器
while os.path.exists(output_file):
    file_count += 1
    output_file = f"c:/Users/o_ovi/Desktop/Java/June2024/YokiProject/MergedFile{file_count}.xlsx"

# 将合并后的 DataFrame 写入新的 Excel 文件
merged_df.to_excel(output_file, index=False)