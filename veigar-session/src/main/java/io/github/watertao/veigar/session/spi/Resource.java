package io.github.watertao.veigar.session.spi;

import java.util.List;

/**
 * Created by watertao on 3/27/16.
 */
public interface Resource {

  /**
   * 获取资源相关的 属性 列表
   *
   * @return
     */
  List<String> getAttributes();

}
