;Notes: #==win !==Alt 2015-05-20  ^==Ctr  +==shift
^+e:: Run D:\JavaSoft\eclipse\eclipse.exe
^+q:: Run D:\Program Files (x86)\Tencent\TIM\Bin\QQScLauncher.exe
^+w:: Run D:\Program Files (x86)\Tencent\WeChat\WeChat.exe
^+G:: Run C:\Users\taihao\AppData\Local\Google\Chrome\Application\chrome.exe
^+S:: Run E:\Upan\Sublime Text Build 3083 x64\Sublime Text Build 3083 x64\sublime_text.exe
^+Y:: Run D:\Program Files (x86)\Netease\CloudMusic\cloudmusic.exe
#!l:: Run C:\Users\taihao\Desktop\李宁波_技术部当日个人工作完成度填报表.xlsx
#!a:: Run https://www.codecademy.com/courses/react-102/lessons/child-updates-parents-state/exercises/child-updates-parents-state-intro?action=lesson_resume
#!e:: Run https://exmail.qq.com/cgi-bin/loginpage?t=dm_loginpage&dmtype=bizmail&s=session_timeout
#!o:: Run https://www.oschina.net/
#!b:: Run https://www.baidu.com/
#!i:: Run http://v.itcast.cn/map/22.html
#!c:: Run http://www.cnblogs.com/
#!s:: Run C:\Users\taihao\Desktop\Shadowsocks-4.0.7\Shadowsocks.exe
#!z:: Run C:\Users\taihao\Desktop\change.bat
#!t:: Run https://translate.google.cn
^+c::
; null= 
send ^c
sleep,200
clipboard=%clipboard% ;%null%
tooltip,%clipboard%
sleep,500
tooltip,
return