package org.apache.hudi.writer;

import org.apache.flink.api.java.functions.KeySelector;
import org.apache.hudi.common.model.HoodieRecord;
import org.apache.hudi.writer.common.HoodieWriteInput;

public class HoodieRecordKeySelector implements KeySelector<HoodieWriteInput<HoodieRecord>, String> {
  @Override
  public String getKey(HoodieWriteInput<HoodieRecord> value) throws Exception {
    return value.getInputs().getPartitionPath();
  }
}