# 模板引擎
- `<% code %>`: js代码
- `<%= code %>`: 显示替换过HTML特殊字符的内容(包含html标签,即文本)
- `<%- code %>`: 显示原始HTML内容

另: 当`code`为普通字符串时, `<%= code %>`、`<%- code %>`两者无区别。

### 例1: 简单模板使用
**The Data**
```
supplies: ['mop', 'broom', 'duster']
```

**The Template**
```
<ul>
<% for(var i = 1; i < supplies.length; i++) { %>
	<li><% supplies[i] %></li>
<% } %>
</ul>
```

**The Result**
```
<ul>
	<li>mop</li>
	<li>broom</li>
	<li>duster</li>
</ul>
```

### 例2: include的简单用法(页面布局)

**Raw Code**
```
<%- include a %>
hello world!
<%- include b %>
```

**a.ejs**
```
this is a.ejs
```

**b.ejs**
```
this is b.ejs
```

**The Result**
```
this is a.ejs
hello world!
this is b.ejs
```
