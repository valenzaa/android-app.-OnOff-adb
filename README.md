# android-app.-OnOff-adb
### android OnOff adb 
### แอป Android เพื่อปิดหรือเปิด ADB (Android Debug Bridge) mode นั้นไม่สามารถทำได้โดยตรงผ่านแอปปกติที่รันบน Android เนื่องจากการตั้งค่า### ของ ADB เป็นส่วนหนึ่งของระบบปฏิบัติการและต้องการสิทธิ์ระดับสูง (root) เพื่อทำการเปลี่ยนแปลง
### หากอุปกรณ์ของคุณถูก root คุณอาจสามารถเขียนสคริปต์หรือแอปพลิเคชันเพื่อจัดการ ADB mode ได้โดยใช้คำสั่ง su เพื่อเพิ่มสิทธิ์ superuser แต่หาก### อุปกรณ์ของคุณไม่ได้ root คุณจะไม่สามารถทำได้เนื่องจากข้อจำกัดของระบบ Android ที่ป้องกันการเปลี่ยนแปลงในส่วนนี้เพื่อความปลอดภัย
### นี่คือตัวอย่างคร่าว ๆ สำหรับการสร้างแอปที่ใช้สิทธิ์ root เพื่อปิด/เปิด ADB mode:
 
### การอธิบายโค้ด

    MainActivity: มีปุ่มสองปุ่มเพื่อเปิดและปิด ADB mode
    runAsRoot: ฟังก์ชันที่รันคำสั่งด้วยสิทธิ์ root

### ข้อควรระวัง
    การ root อุปกรณ์มีความเสี่ยงที่จะทำให้อุปกรณ์ไม่ปลอดภัย
    การเปลี่ยนแปลงการตั้งค่าระบบอาจทำให้อุปกรณ์ทำงานผิดปกติ
    แอปนี้จะทำงานได้เฉพาะบนอุปกรณ์ที่ถูก root เท่านั้น
