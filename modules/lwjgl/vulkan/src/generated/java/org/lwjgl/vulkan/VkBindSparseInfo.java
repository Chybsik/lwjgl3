/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a sparse binding operation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BIND_SPARSE_INFO STRUCTURE_TYPE_BIND_SPARSE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkDeviceGroupBindSparseInfo}</li>
 * <li>If {@code waitSemaphoreCount} is not 0, {@code pWaitSemaphores} <b>must</b> be a valid pointer to an array of {@code waitSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>If {@code bufferBindCount} is not 0, {@code pBufferBinds} <b>must</b> be a valid pointer to an array of {@code bufferBindCount} valid {@link VkSparseBufferMemoryBindInfo} structures</li>
 * <li>If {@code imageOpaqueBindCount} is not 0, {@code pImageOpaqueBinds} <b>must</b> be a valid pointer to an array of {@code imageOpaqueBindCount} valid {@link VkSparseImageOpaqueMemoryBindInfo} structures</li>
 * <li>If {@code imageBindCount} is not 0, {@code pImageBinds} <b>must</b> be a valid pointer to an array of {@code imageBindCount} valid {@link VkSparseImageMemoryBindInfo} structures</li>
 * <li>If {@code signalSemaphoreCount} is not 0, {@code pSignalSemaphores} <b>must</b> be a valid pointer to an array of {@code signalSemaphoreCount} valid {@code VkSemaphore} handles</li>
 * <li>Both of the elements of {@code pSignalSemaphores}, and the elements of {@code pWaitSemaphores} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkSparseBufferMemoryBindInfo}, {@link VkSparseImageMemoryBindInfo}, {@link VkSparseImageOpaqueMemoryBindInfo}, {@link VK10#vkQueueBindSparse QueueBindSparse}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code waitSemaphoreCount} &ndash; the number of semaphores upon which to wait before executing the sparse binding operations for the batch.</li>
 * <li>{@code pWaitSemaphores} &ndash; a pointer to an array of semaphores upon which to wait on before the sparse binding operations for this batch begin execution. If semaphores to wait on are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-waiting">semaphore wait operation</a>.</li>
 * <li>{@code bufferBindCount} &ndash; the number of sparse buffer bindings to perform in the batch.</li>
 * <li>{@code pBufferBinds} &ndash; a pointer to an array of {@link VkSparseBufferMemoryBindInfo} structures.</li>
 * <li>{@code imageOpaqueBindCount} &ndash; the number of opaque sparse image bindings to perform.</li>
 * <li>{@code pImageOpaqueBinds} &ndash; a pointer to an array of {@link VkSparseImageOpaqueMemoryBindInfo} structures, indicating opaque sparse image bindings to perform.</li>
 * <li>{@code imageBindCount} &ndash; the number of sparse image bindings to perform.</li>
 * <li>{@code pImageBinds} &ndash; a pointer to an array of {@link VkSparseImageMemoryBindInfo} structures, indicating sparse image bindings to perform.</li>
 * <li>{@code signalSemaphoreCount} &ndash; the number of semaphores to be signaled once the sparse binding operations specified by the structure have completed execution.</li>
 * <li>{@code pSignalSemaphores} &ndash; a pointer to an array of semaphores which will be signaled when the sparse binding operations for this batch have completed execution. If semaphores to be signaled are provided, they define a <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#synchronization-semaphores-signaling">semaphore signal operation</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindSparseInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t waitSemaphoreCount;
 *     VkSemaphore const * pWaitSemaphores;
 *     uint32_t bufferBindCount;
 *     {@link VkSparseBufferMemoryBindInfo VkSparseBufferMemoryBindInfo} const * pBufferBinds;
 *     uint32_t imageOpaqueBindCount;
 *     {@link VkSparseImageOpaqueMemoryBindInfo VkSparseImageOpaqueMemoryBindInfo} const * pImageOpaqueBinds;
 *     uint32_t imageBindCount;
 *     {@link VkSparseImageMemoryBindInfo VkSparseImageMemoryBindInfo} const * pImageBinds;
 *     uint32_t signalSemaphoreCount;
 *     VkSemaphore const * pSignalSemaphores;
 * }</code></pre>
 */
public class VkBindSparseInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WAITSEMAPHORECOUNT,
        PWAITSEMAPHORES,
        BUFFERBINDCOUNT,
        PBUFFERBINDS,
        IMAGEOPAQUEBINDCOUNT,
        PIMAGEOPAQUEBINDS,
        IMAGEBINDCOUNT,
        PIMAGEBINDS,
        SIGNALSEMAPHORECOUNT,
        PSIGNALSEMAPHORES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WAITSEMAPHORECOUNT = layout.offsetof(2);
        PWAITSEMAPHORES = layout.offsetof(3);
        BUFFERBINDCOUNT = layout.offsetof(4);
        PBUFFERBINDS = layout.offsetof(5);
        IMAGEOPAQUEBINDCOUNT = layout.offsetof(6);
        PIMAGEOPAQUEBINDS = layout.offsetof(7);
        IMAGEBINDCOUNT = layout.offsetof(8);
        PIMAGEBINDS = layout.offsetof(9);
        SIGNALSEMAPHORECOUNT = layout.offsetof(10);
        PSIGNALSEMAPHORES = layout.offsetof(11);
    }

    /**
     * Creates a {@code VkBindSparseInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindSparseInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code waitSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
    @Nullable
    @NativeType("VkSemaphore const *")
    public LongBuffer pWaitSemaphores() { return npWaitSemaphores(address()); }
    /** Returns the value of the {@code bufferBindCount} field. */
    @NativeType("uint32_t")
    public int bufferBindCount() { return nbufferBindCount(address()); }
    /** Returns a {@link VkSparseBufferMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pBufferBinds} field. */
    @Nullable
    @NativeType("VkSparseBufferMemoryBindInfo const *")
    public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() { return npBufferBinds(address()); }
    /** Returns the value of the {@code imageOpaqueBindCount} field. */
    @NativeType("uint32_t")
    public int imageOpaqueBindCount() { return nimageOpaqueBindCount(address()); }
    /** Returns a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageOpaqueBinds} field. */
    @Nullable
    @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
    public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() { return npImageOpaqueBinds(address()); }
    /** Returns the value of the {@code imageBindCount} field. */
    @NativeType("uint32_t")
    public int imageBindCount() { return nimageBindCount(address()); }
    /** Returns a {@link VkSparseImageMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageBinds} field. */
    @Nullable
    @NativeType("VkSparseImageMemoryBindInfo const *")
    public VkSparseImageMemoryBindInfo.Buffer pImageBinds() { return npImageBinds(address()); }
    /** Returns the value of the {@code signalSemaphoreCount} field. */
    @NativeType("uint32_t")
    public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
    /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
    @Nullable
    @NativeType("VkSemaphore const *")
    public LongBuffer pSignalSemaphores() { return npSignalSemaphores(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBindSparseInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBindSparseInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
    public VkBindSparseInfo pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npWaitSemaphores(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@code pBufferBinds} field. */
    public VkBindSparseInfo pBufferBinds(@Nullable @NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) { npBufferBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@code pImageOpaqueBinds} field. */
    public VkBindSparseInfo pImageOpaqueBinds(@Nullable @NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) { npImageOpaqueBinds(address(), value); return this; }
    /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@code pImageBinds} field. */
    public VkBindSparseInfo pImageBinds(@Nullable @NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) { npImageBinds(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
    public VkBindSparseInfo pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { npSignalSemaphores(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindSparseInfo set(
        int sType,
        long pNext,
        @Nullable LongBuffer pWaitSemaphores,
        @Nullable VkSparseBufferMemoryBindInfo.Buffer pBufferBinds,
        @Nullable VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds,
        @Nullable VkSparseImageMemoryBindInfo.Buffer pImageBinds,
        @Nullable LongBuffer pSignalSemaphores
    ) {
        sType(sType);
        pNext(pNext);
        pWaitSemaphores(pWaitSemaphores);
        pBufferBinds(pBufferBinds);
        pImageOpaqueBinds(pImageOpaqueBinds);
        pImageBinds(pImageBinds);
        pSignalSemaphores(pSignalSemaphores);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindSparseInfo set(VkBindSparseInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindSparseInfo malloc() {
        return wrap(VkBindSparseInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindSparseInfo calloc() {
        return wrap(VkBindSparseInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindSparseInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindSparseInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindSparseInfo} instance for the specified memory address. */
    public static VkBindSparseInfo create(long address) {
        return wrap(VkBindSparseInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindSparseInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindSparseInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindSparseInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindSparseInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkBindSparseInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBindSparseInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkBindSparseInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBindSparseInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkBindSparseInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindSparseInfo mallocStack(MemoryStack stack) {
        return wrap(VkBindSparseInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindSparseInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindSparseInfo callocStack(MemoryStack stack) {
        return wrap(VkBindSparseInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindSparseInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindSparseInfo.PNEXT); }
    /** Unsafe version of {@link #waitSemaphoreCount}. */
    public static int nwaitSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.WAITSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pWaitSemaphores() pWaitSemaphores}. */
    @Nullable public static LongBuffer npWaitSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES), nwaitSemaphoreCount(struct)); }
    /** Unsafe version of {@link #bufferBindCount}. */
    public static int nbufferBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.BUFFERBINDCOUNT); }
    /** Unsafe version of {@link #pBufferBinds}. */
    @Nullable public static VkSparseBufferMemoryBindInfo.Buffer npBufferBinds(long struct) { return VkSparseBufferMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS), nbufferBindCount(struct)); }
    /** Unsafe version of {@link #imageOpaqueBindCount}. */
    public static int nimageOpaqueBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT); }
    /** Unsafe version of {@link #pImageOpaqueBinds}. */
    @Nullable public static VkSparseImageOpaqueMemoryBindInfo.Buffer npImageOpaqueBinds(long struct) { return VkSparseImageOpaqueMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS), nimageOpaqueBindCount(struct)); }
    /** Unsafe version of {@link #imageBindCount}. */
    public static int nimageBindCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.IMAGEBINDCOUNT); }
    /** Unsafe version of {@link #pImageBinds}. */
    @Nullable public static VkSparseImageMemoryBindInfo.Buffer npImageBinds(long struct) { return VkSparseImageMemoryBindInfo.createSafe(memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS), nimageBindCount(struct)); }
    /** Unsafe version of {@link #signalSemaphoreCount}. */
    public static int nsignalSemaphoreCount(long struct) { return UNSAFE.getInt(null, struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT); }
    /** Unsafe version of {@link #pSignalSemaphores() pSignalSemaphores}. */
    @Nullable public static LongBuffer npSignalSemaphores(long struct) { return memLongBufferSafe(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES), nsignalSemaphoreCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindSparseInfo.PNEXT, value); }
    /** Sets the specified value to the {@code waitSemaphoreCount} field of the specified {@code struct}. */
    public static void nwaitSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.WAITSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
    public static void npWaitSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES, memAddressSafe(value)); nwaitSemaphoreCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code bufferBindCount} field of the specified {@code struct}. */
    public static void nbufferBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.BUFFERBINDCOUNT, value); }
    /** Unsafe version of {@link #pBufferBinds(VkSparseBufferMemoryBindInfo.Buffer) pBufferBinds}. */
    public static void npBufferBinds(long struct, @Nullable VkSparseBufferMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PBUFFERBINDS, memAddressSafe(value)); nbufferBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageOpaqueBindCount} field of the specified {@code struct}. */
    public static void nimageOpaqueBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo.Buffer) pImageOpaqueBinds}. */
    public static void npImageOpaqueBinds(long struct, @Nullable VkSparseImageOpaqueMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS, memAddressSafe(value)); nimageOpaqueBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code imageBindCount} field of the specified {@code struct}. */
    public static void nimageBindCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.IMAGEBINDCOUNT, value); }
    /** Unsafe version of {@link #pImageBinds(VkSparseImageMemoryBindInfo.Buffer) pImageBinds}. */
    public static void npImageBinds(long struct, @Nullable VkSparseImageMemoryBindInfo.Buffer value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEBINDS, memAddressSafe(value)); nimageBindCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code signalSemaphoreCount} field of the specified {@code struct}. */
    public static void nsignalSemaphoreCount(long struct, int value) { UNSAFE.putInt(null, struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT, value); }
    /** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
    public static void npSignalSemaphores(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); nsignalSemaphoreCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nwaitSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES));
        }
        int bufferBindCount = nbufferBindCount(struct);
        if (bufferBindCount != 0) {
            long pBufferBinds = memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS);
            check(pBufferBinds);
            VkSparseBufferMemoryBindInfo.validate(pBufferBinds, bufferBindCount);
        }
        int imageOpaqueBindCount = nimageOpaqueBindCount(struct);
        if (imageOpaqueBindCount != 0) {
            long pImageOpaqueBinds = memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS);
            check(pImageOpaqueBinds);
            VkSparseImageOpaqueMemoryBindInfo.validate(pImageOpaqueBinds, imageOpaqueBindCount);
        }
        int imageBindCount = nimageBindCount(struct);
        if (imageBindCount != 0) {
            long pImageBinds = memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS);
            check(pImageBinds);
            VkSparseImageMemoryBindInfo.validate(pImageBinds, imageBindCount);
        }
        if (nsignalSemaphoreCount(struct) != 0) {
            check(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBindSparseInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindSparseInfo, Buffer> implements NativeResource {

        private static final VkBindSparseInfo ELEMENT_FACTORY = VkBindSparseInfo.create(-1L);

        /**
         * Creates a new {@code VkBindSparseInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindSparseInfo#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkBindSparseInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindSparseInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindSparseInfo.npNext(address()); }
        /** Returns the value of the {@code waitSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int waitSemaphoreCount() { return VkBindSparseInfo.nwaitSemaphoreCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field. */
        @Nullable
        @NativeType("VkSemaphore const *")
        public LongBuffer pWaitSemaphores() { return VkBindSparseInfo.npWaitSemaphores(address()); }
        /** Returns the value of the {@code bufferBindCount} field. */
        @NativeType("uint32_t")
        public int bufferBindCount() { return VkBindSparseInfo.nbufferBindCount(address()); }
        /** Returns a {@link VkSparseBufferMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pBufferBinds} field. */
        @Nullable
        @NativeType("VkSparseBufferMemoryBindInfo const *")
        public VkSparseBufferMemoryBindInfo.Buffer pBufferBinds() { return VkBindSparseInfo.npBufferBinds(address()); }
        /** Returns the value of the {@code imageOpaqueBindCount} field. */
        @NativeType("uint32_t")
        public int imageOpaqueBindCount() { return VkBindSparseInfo.nimageOpaqueBindCount(address()); }
        /** Returns a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageOpaqueBinds} field. */
        @Nullable
        @NativeType("VkSparseImageOpaqueMemoryBindInfo const *")
        public VkSparseImageOpaqueMemoryBindInfo.Buffer pImageOpaqueBinds() { return VkBindSparseInfo.npImageOpaqueBinds(address()); }
        /** Returns the value of the {@code imageBindCount} field. */
        @NativeType("uint32_t")
        public int imageBindCount() { return VkBindSparseInfo.nimageBindCount(address()); }
        /** Returns a {@link VkSparseImageMemoryBindInfo.Buffer} view of the struct array pointed to by the {@code pImageBinds} field. */
        @Nullable
        @NativeType("VkSparseImageMemoryBindInfo const *")
        public VkSparseImageMemoryBindInfo.Buffer pImageBinds() { return VkBindSparseInfo.npImageBinds(address()); }
        /** Returns the value of the {@code signalSemaphoreCount} field. */
        @NativeType("uint32_t")
        public int signalSemaphoreCount() { return VkBindSparseInfo.nsignalSemaphoreCount(address()); }
        /** Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field. */
        @Nullable
        @NativeType("VkSemaphore const *")
        public LongBuffer pSignalSemaphores() { return VkBindSparseInfo.npSignalSemaphores(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBindSparseInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindSparseInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBindSparseInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindSparseInfo.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
        public VkBindSparseInfo.Buffer pWaitSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npWaitSemaphores(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo.Buffer} to the {@code pBufferBinds} field. */
        public VkBindSparseInfo.Buffer pBufferBinds(@Nullable @NativeType("VkSparseBufferMemoryBindInfo const *") VkSparseBufferMemoryBindInfo.Buffer value) { VkBindSparseInfo.npBufferBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} to the {@code pImageOpaqueBinds} field. */
        public VkBindSparseInfo.Buffer pImageOpaqueBinds(@Nullable @NativeType("VkSparseImageOpaqueMemoryBindInfo const *") VkSparseImageOpaqueMemoryBindInfo.Buffer value) { VkBindSparseInfo.npImageOpaqueBinds(address(), value); return this; }
        /** Sets the address of the specified {@link VkSparseImageMemoryBindInfo.Buffer} to the {@code pImageBinds} field. */
        public VkBindSparseInfo.Buffer pImageBinds(@Nullable @NativeType("VkSparseImageMemoryBindInfo const *") VkSparseImageMemoryBindInfo.Buffer value) { VkBindSparseInfo.npImageBinds(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
        public VkBindSparseInfo.Buffer pSignalSemaphores(@Nullable @NativeType("VkSemaphore const *") LongBuffer value) { VkBindSparseInfo.npSignalSemaphores(address(), value); return this; }

    }

}