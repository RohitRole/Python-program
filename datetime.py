
# import datetime

# if __name__=="__main__":
	
# 	today_date=datetime.date.today()
# 	print(today_date)


import datetime

if __name__=="__main__":
	current_timestamp=datetime.datetime.now()
	print(current_timestamp.strftime("%c"))
	 
	new_time=current_timestamp + datetime.timedelta(minutes=10)
	print(new_time.strftime("%c"))
	print(new_time.strftime("%I : %M : %S"))