package service.provider;

import java.util.List;

import entity.Provider;

public interface ProviderService {
    //查询所有供应商数据
	List<Provider> getAll();
}
