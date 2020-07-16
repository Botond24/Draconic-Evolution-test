package com.brandon3055.draconicevolution.api.modules.data;

import com.brandon3055.brandonscore.api.power.IOPStorage;
import com.brandon3055.brandonscore.api.power.OPStorage;
import com.brandon3055.brandonscore.utils.Utils;
import com.brandon3055.draconicevolution.api.modules.lib.ModularOPStorage;
import com.brandon3055.draconicevolution.api.modules.lib.ModuleContext;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.Map;

/**
 * Created by brandon3055 on 3/5/20.
 */
public class EnergyData implements ModuleData<EnergyData> {
    private final long capacity;
    private final long transfer;

    public EnergyData(long capacity, long transfer) {
        this.capacity = capacity;
        this.transfer = transfer;
    }

    public long getCapacity() {
        return capacity;
    }

    public long getTransfer() {
        return transfer;
    }

    @Override
    public EnergyData combine(EnergyData other) {
        return new EnergyData(capacity + other.capacity, transfer + other.transfer);
    }

    @Override
    public void addInformation(Map<ITextComponent, ITextComponent> map, ModuleContext context) {
        long capacity = getCapacity();
        long transfer = getTransfer();
        map.put(new TranslationTextComponent("module.draconicevolution.energy.capacity"), new TranslationTextComponent("module.draconicevolution.energy.capacity.value", Utils.formatNumber(capacity)));
        map.put(new TranslationTextComponent("module.draconicevolution.energy.transfer"), new TranslationTextComponent("module.draconicevolution.energy.transfer.value", Utils.formatNumber(transfer)));
    }
}