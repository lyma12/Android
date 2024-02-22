Các bài tập của môn phát triển ứng dụng trên nền tảng di động
Sử dụng Kotlin trên Android Studio.
* Bài 1. Dice Roller
  Tạo ứng dụng Android Đổ xúc xắc cho phép người dùng nhấp vào một Button trong ứng dụng để đổ một viên xúc xắc. Kết quả đổ xúc xắc sẽ xuất hiện trong một TextView trên màn hình.
  <img width="181" alt="image" src="https://github.com/lyma12/Android/assets/79680072/d3d32e1b-1914-4b67-af22-262183efe96d">
* Bài 2. Simple Calculation
  Tạo ứng dụng máy tính đơn giản. Thực hiện các phép tính cộng, trừ, nhân, chia với các toán hạng là số nguyên (bỏ qua nút bấm dấu chấm).
  Các nút chức năng CE: Clear Entry - Xóa toán hạng hiện tại về 0, C: Clear - Xóa phép tính, BS: Backspace - Xóa chữ số hàng đơn vị của toán hạng hiện tại (nếu còn 1 chữ số thì xóa về 0).
  <img width="712" alt="image" src="https://github.com/lyma12/Android/assets/79680072/a50bf78c-8de2-49e0-ab4e-fdf751b8bce5">
* Bài 3. Mail
  Tạo ứng dụng giao diện giống Gmail sử dụng ListView.
  <img width="173" alt="image" src="https://github.com/lyma12/Android/assets/79680072/dcb73e59-bcd1-42de-8cc9-5cad366cfe64">
* Bài 4. Danh ba
  Xây dựng ứng dụng Danh bạ gồm các chức năng sau:
  Màn hình chỉnh hiển thị danh sách danh bạ (giống ảnh bên),mỗi đối tượng bao gồm các thông tin : ID, Họtên, Số điện thoại, Email. Danh sách chỉ hiện Họ tên.
  Khi nhấn vào đối tượng thì mở màn hình hiển thị các thông tin chi tiết.
  Contextmenu: khi nhấn và giữ vào một đối tượng thì hiện menu cho phép gọi điện, nhắn tin SMS hoặc gửi email.
  <img width="141" alt="image" src="https://github.com/lyma12/Android/assets/79680072/0a4826a0-29dc-4d70-9c1a-abcb42931088">
* Bài 5. Quan ly sinh vien
  Lập trình ứng dụng Quản lý sinh viên với các yêu cầu sau:
+ Thiết lập sử dụng thư viện Room để quản lý sinh viên với các thông tin bao gồm MSSV, Họ tên, Ngày sinh, Quê quán
+ Sử dụng Recycler View để hiển thị danh sách sinh viên ở màn hình chính, mỗi sinh viên hiển thị MSSV, Họ tên, Email (Email SIS được tạo từ MSSV và Họ tên)
+ Sử dụng menu để chuyển đến màn hình thêm sinh viên, nhập các thông tin MSSV, Họ tên từ EditText, Ngày sinh nhập từ Date picker dialog, Quê quán nhập từ AutoCompleteTextView (dữ liệu tỉnh thành được nhập từ file text nhúng trong resource). Khi nhập xong, quay trở lại màn hình danh sách thì cần cập nhật danh sách.
+ Khi nhấn vào sinh viên thì mở màn hình hiển thị thông tin chi tiết của sinh viên, trên màn hình này có các nút cho phép cập nhật hoặc xóa sinh viên. Khi quay trở lại cũng cần cập nhật danh sách.



