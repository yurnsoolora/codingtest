import datetime

def solution(date1, date2):
    datea = datetime.date(date1[0], date1[1], date1[2])
    dateb = datetime.date(date2[0], date2[1], date2[2])
    
    if datea < dateb:
        return 1
    return 0