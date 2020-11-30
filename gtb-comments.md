### 完成度：
* 部分接口缺失，部分接口实现不符合要求，所有接口无法正常使用，且没有使用数据库保存数据
* 具体验收测试结果详见：`gtb-test-results.md`

__Details:__
- \- 没有按照要求实现接口，查询未分组学员，查询未分组讲师
- \- 接口缺失，删除学员，删除讲师，查询分组
- \- 没有处理参数校验
- \- 分组时没有处理讲师不够的情况
- \- 应该使用数据库保存数据

### 测试：
* Controller,Service,Repository层均无测试

### 知识点：
* 需要了解下三层(Three Layer)架构
* 没有使用数据库，对JPA的使用无法考察
* 能够使用Lombok减少代码量

__Details:__
- \- 状态码为200时，可以省略@ResponseStatus注解
- \- Service之间不应该互相调用
- \- 了解下Java7的钻石操作符

### 工程实践：

__Details:__
- \- Unused, 未使用的import语句
- \- Code Smell, Magic Number
- \- Style, 注意代码风格，哪儿应该加空格，哪儿应该不加空格
- \- Generic, 没有使用泛型
- \- 多注意下IDEA的报灰或警告，要及时修复
- \- Responsibility, 数据存储相关的操作，应该由Repository层来做
- \- "trainee.getGrouped() == true" 可以简化
- \- 计算id的方式不够健壮，可以使用字段保存最大id

### 综合：
* 完成度很有问题，工程实践有很多小问题需要注意，知识点运用相对好些，继续加油


